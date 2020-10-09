parser grammar TurtleParser;

options {
  language = Java;
  tokenVocab = TurtleLexer;
}

@header {
  package TP1;
}

// Fill here!
 document returns [ASD.Turtle out]    : list = listPhrase { $out = new ASD.Turtle($list.out); };

listPhrase returns [List<ASD.Phrase> out]  @init {List<ASD.Phrase> list = new ArrayList<>();}
											: (p = phrase POINT {list.add($p.out);} )*
											{ $out = list ;};

phrase returns [ASD.Phrase out] : s = sujet list = listCompl { $out = new ASD.Phrase($s.out,$list.out);};	
	
listCompl returns [List<ASD.Compl> out] @init { List<ASD.Compl> list = new ArrayList<>();}
										: c1 = compl {list.add($c1.out);} (PTVIRG c2 = compl { list.add($c2.out);})*
										{ $out = list ; } ;

compl returns [ASD.Compl out] : p = predicat list = listObjet { $out = new ASD.Compl($p.out,$list.out);};
	
listObjet returns [List<ASD.Objet> out = new ArrayList<>()]
										: o1 = objet {$out.add($o1.out);} (VIRG o2 = objet {$out.add($o2.out);})*
										;
										

sujet returns [ASD.Sujet out] : m = MOT { $out = new ASD.Sujet($m.text);};

	
predicat returns [ASD.Predicat out] : m = MOT { $out = new ASD.Predicat($m.text);};


objet returns [ASD.Objet out] : ( m = MOT {$out = new ASD.Obj($m.text);})
							| (t = TEXTE {$out = new ASD.Text($t.text);});
	
//texte returns [String out] : s= TEXTE {$out = $s.text;};
//obj returns [ASD.Obj out] :  s = MOT { $out = new ASD.Obj($s.text); };