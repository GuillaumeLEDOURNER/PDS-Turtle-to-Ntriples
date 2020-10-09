package TP1;

import java.nio.file.Paths;

import TP1.ASD.*;

import java.io.IOException;

import java.util.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
  public static void main(String[] args) {
    // Use with a manually made AST
	  
	  Objet prof = new Obj("professeur");
	  Objet pers = new Obj("personne");
	  Objet comp = new Text("Compilation");
	  Objet ferre = new Obj("Ferre");
	  Objet ridoux = new Obj("Ridoux");
	  Objet poly = new Obj("poly");
	  
	  Predicat type = new Predicat("type");
	  Predicat auteur = new Predicat("auteur");
	  Predicat titre = new Predicat("titre");
	  
	  Sujet sRidoux = new Sujet("Ridoux");
	  Sujet p117 = new Sujet("poly117");
	  
	  ArrayList<Objet> listRidoux = new ArrayList<>();
	  listRidoux.add(pers);
	  listRidoux.add(prof);
	  
	  ArrayList<Objet> listTitre = new ArrayList<>();
	  listTitre.add(comp);
	  
	  ArrayList<Objet> listAuteur = new ArrayList<>();
	  listAuteur.add(ridoux);
	  listAuteur.add(ferre);
	  
	  ArrayList<Objet> listType = new ArrayList<>();
	  listType.add(poly);
	  
	  Compl compl4 = new Compl(type, listRidoux);
	  Compl compl3 = new Compl(titre,listTitre);
	  Compl compl2 = new Compl(auteur,listAuteur);
	  Compl compl1 = new Compl(type,listType);
	  
	  compl4.toNtriple();
	  
	  ArrayList<Compl> listCompl1 = new ArrayList<>();
	  listCompl1.add(compl1);
	  listCompl1.add(compl2);
	  listCompl1.add(compl3);
	  
	  ArrayList<Compl> listCompl2 = new ArrayList<>();
	  listCompl2.add(compl4);
	  
	  Phrase p1 = new Phrase(p117,listCompl1);
	  Phrase p2 = new Phrase(sRidoux, listCompl2);
	  
	  ArrayList<Phrase> listPhrase = new ArrayList<>();
	  listPhrase.add(p1);
	  listPhrase.add(p2);
	  
	  Turtle turtle = new Turtle(listPhrase);
	  
	  
	  System.out.println("Ntriple : ");
	  System.out.println(turtle.toNtriples());
	  
	  System.out.println("\n-------------------\n");
	  
	  

    // Use with lexer and parser
    
   try {
      // Set input
      CharStream input;
      if(args.length == 0) {
        // From standard input
        input = CharStreams.fromStream(System.in);
      }
      else {
        // From file set in first argument
        input = CharStreams.fromPath(Paths.get(args[0]));
      }

      // Instantiate Lexer
      TurtleLexer lexer = new TurtleLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      System.out.println(tokens.toString());
      // Instantiate Parser
      TurtleParser parser = new TurtleParser(tokens);

      // Parse
      Turtle ast = parser.document().out;

      // Print as Ntriples
      System.out.println(ast.toNtriples());
    } catch(IOException e) {
      e.printStackTrace();
    }
    
  }
}
