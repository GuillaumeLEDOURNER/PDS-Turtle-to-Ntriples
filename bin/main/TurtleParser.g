parser grammar TurtleParser;

options {
  language = Java;
  tokenVocab = TurtleLexer;
}

@header {
  package TP1;
}

document returns [ASD.Turtle out]
  : s = turtle EOF { $out = new ASD.Turtle($s.out); }
  ;

// Fill here!
 
turtle returns [List<ASD.Phrase> out]
	: (phrases )* phrases POINT
	;
	
phrases 
	: sujet compl (PTVIRG compl)*
	;

compl 
	:  predicat  objet (VIRG objet)* 
	;
	
sujet
	: MOT 
	;
	
predicat 
	: MOT
	;

objet
	: MOT 
	| TEXTE
	;
	
