
import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which animal would you like to see?");

        String choice = scan.nextLine();

        while (true) { 
            if(choice.toLowerCase().equals("cat")){
                System.out.println("                                    \n            :\"-.          .-\";                   \n            |:`.`.__..__.\'.\';|                   \n            || :-\"      \"-; ||                   \n            :;              :;                   \n            /  .==.    .==.  \\                   \n           :      _.--._      ;                  \n           ; .--.\' `--\' `.--. :                  \n          :   __;`      \':__   ;                 \n          ;  \'  \'-._:;_.-\'  \'  :                 \n          \'.       `--\'       .\'                 \n           .\"-._          _.-\".                  \n         .\'     \"\"------\"\"     `.                \n        /`-                    -\'\\               \n       /`-                      -\'\\              \n      :`-   .\'              `.   -\';             \n      ;    /                  \\    :             \n     :    :                    ;    ;            \n     ;    ;                    :    :            \n     \':_:.\'                    \'.;_;\'            \n        :_                      _;               \n        ; \"-._                -\" :`-.     _.._   \n        :_          ()          _;   \"--::__. `. \n         \\\"-                  -\"/`._           : \n        .-\"-.                 -\"-.  \"\"--..____.\' \n       /         .__  __.         \\              \n      : / ,       / \"\" \\       . \\ ;          \n       \"-:___..--\"      \"--..___;-\"   ");
                break;
            }else if(choice.toLowerCase().equals("dog")){
                System.out.println("         ,--._______,-. \n       ,\',\'  ,    .  ,_`-. \n      / /  ,\' , _` ``. |  )       `-.. \n     (,\';\'\"\"`/ \'\"`-._ ` \\/ ______    \\\\ \n       : ,o.-`- ,o.  )\\` -\'      `---.)) \n       : , d8b ^-.   \'|   `.      `    `. \n       |/ __:_     `. |  ,  `       `    \\ \n       | ( ,-.`-.    ;\'  ;   `       :    ; \n       | |  ,   `.      /     ;      :    \\ \n       ;-\'`:::._,`.__),\'             :     ; \n      / ,  `-   `--                  ;     | \n     /  \\                   `       ,      | \n    (    `     :              :    ,\\      | \n     \\   `.    :     :        :  ,\'  \\    : \n      \\    `|-- `     \\ ,\'    ,-\'     :-.-\'; \n      :     |`--.______;     |        :    : \n       :    /           |    |         |   \\ \n       |    ;           ;    ;        /     ; \n     _/--\' |           :`-- /         \\_:_:_| \n   ,\',\',\'  |           |___ \\ \n   `^._,--\'           / , , .) \n                      `-._,-\' \n");
                break;
            }else if(choice.toLowerCase().equals("fish")){
                System.out.println("         .\'|_.-\n         .\'  \'  /_\n      .-\"    -.   \'>\n   .- -. -.    \'. /    /|_\n  .-.--.-.       \' >  /  /\n (o( o( o )       \\_.\"  <\n  \'-\'-\'\'-\'            ) <\n(       _.-\'-.   ._\\.  _\\\n \'----\"/--.__.-) _-  \\|\n       \"V\"\"    \"V\"");
                break;
            }else{
                System.out.println("Invalid Option! Enter Dog, Cat, or Fish.");
                choice = scan.nextLine();
            }
        }

        

        
    }
}