public class MadLibs {
  /*
This program generates a mad libbed story.
Author: Dolly
Date: 7th Jan 2023
  */
  	public static void main(String[] args){
      String name1= "Dolly";
      String adjective1 = "depressed";
      String adjective2 =  "hectic";
      String adjective3 = "happy";

      // verb
      String verb1 = "yelling";

      // nouns
      String noun1= "homophobes";
      String noun2 = "Rainbow Flags";
      String noun3 = "song";
      String noun4 = "protester";
      String noun5 = "water";
      String noun6 = "Queer";

      // second charachter
      String name2 = "Dylan";

      //number
      int number = 2050;

      // place 

      String place1 = "Egypt";
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
