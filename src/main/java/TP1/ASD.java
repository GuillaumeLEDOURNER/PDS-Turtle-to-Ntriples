package TP1;

import java.util.*;

public class ASD {
	
	static public class Turtle {
		List<Phrase> phrases ;
		public Turtle(List<Phrase> lp) {
			phrases = lp;
		}
		public String toNtriples() {
			String s = "";
			for (Phrase p : phrases) {
				s += p.toNtriple();
			}
			return s;
		}
	}

	public static class Phrase {
		Sujet sujet ;
		List <Compl> compl;
		public Phrase (Sujet s, List<Compl> listC) {
			sujet = s;
			compl = listC;
		}
		public String toNtriple() {
			String s = "";
			for (Compl c : compl) {
				for (String st : c.toNtriple()) {
					s += sujet.toNtriple() + st;
				}
			}
			return s;
		}
	}

	public static class Compl {
		Predicat predicat ; 
		List<Objet> objet;
		public Compl (Predicat p, List<Objet> listO) {
			predicat = p;
			objet = listO;
		}
		public List<String> toNtriple() {
			ArrayList<String> s = new ArrayList<>();
			for(Objet o : objet) {
				String r = predicat.toNtriple() + o.toNtriple();
				s.add(r);
			}
			return s;
		}
	}

	public static class Sujet {
		String val;
		public Sujet(String v) {
			val = v;
		}
		public String toNtriple() {		
			String s = "<" + val + "> ";
			return s;
		}
	}

	public static class Predicat {
		String pred;
		public Predicat(String p) {
			pred = p;
		}
		public String toNtriple() {
			String s = "<" + pred + "> ";
			return  s;
		}
	}

	abstract static class Objet{ public abstract String toNtriple(); }

	public static class Text extends Objet{
		String text;
		public Text(String t) {
			text = t;
		}
		public String toNtriple() {
			String s = "\"" + text + "\""+ " .\n";
			return s;
		}
	}

	public static class Obj extends Objet{
		String objet;
		public Obj(String o) {
			objet = o;
		}
		public String toNtriple() {
			String s = "<" + objet + "> "+ ".\n";
			return s;
		}
	}

}
