package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb phrasalVerb1 = new PhrasalVerb("possible", "im");
        Verb phrasalVerbWithSuffix1 = new PhrasalVerbWithSuffix("possible", "im", "ity");

        System.out.println(phrasalVerb1.getWord());
        System.out.println(phrasalVerbWithSuffix1.getWord());

        Preposition phrasalVerb2 = new PhrasalVerb("possible", "im");
        Preposition phrasalVerbWithSuffix2 = new PhrasalVerbWithSuffix("possible", "im", "ity");

        System.out.println(phrasalVerb2.getPreposition());
        System.out.println(phrasalVerb2.getWholeWord());
        System.out.println(phrasalVerbWithSuffix2.getWholeWord());
        System.out.println(phrasalVerbWithSuffix2.getPreposition());

        PhrasalVerb phrasalVerb3 = new PhrasalVerb("possible", "im");
        PhrasalVerb phrasalVerbWithSuffix3 = new PhrasalVerbWithSuffix("possible", "im", "ity");

        System.out.println(phrasalVerb3.getWord());
        System.out.println(phrasalVerb3.getWholeWord());
        System.out.println(phrasalVerb3.getPreposition());
        System.out.println(phrasalVerbWithSuffix3.getWord());
        System.out.println(phrasalVerbWithSuffix3.getPreposition());
        System.out.println(phrasalVerbWithSuffix3.getWholeWord());

        Suffix phrasalVerbWithSuffix4 = new PhrasalVerbWithSuffix("possible", "im", "ity");

        System.out.println(phrasalVerbWithSuffix4.getSuffix());

        PhrasalVerbWithSuffix phrasalVerbWithSuffix5 = new PhrasalVerbWithSuffix("possible", "im", "ity");

        System.out.println(phrasalVerbWithSuffix5.getSuffix());
        System.out.println(phrasalVerbWithSuffix5.getPreposition());
        System.out.println(phrasalVerbWithSuffix5.getWord());
        System.out.println(phrasalVerbWithSuffix5.getWholeWord());


    }
}
