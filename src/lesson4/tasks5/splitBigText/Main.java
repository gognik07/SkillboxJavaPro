package lesson4.tasks5.splitBigText;

public class Main {

    public static void main(String[] args) {
        String text = "This tale grew in the telling, until it became a history of the Great War of the Ring and included many glimpses of the yet more ancient history that preceded it. It was begun soon afterThe Hobbit was written and before its publication in 1937; but I did not go on with this sequel, for I wished first to complete and set in order the mythology and legends of the Elder Days, which had then been taking shape for some years. I desired to do this for my own satisfaction, and I had little hope that other people would be interested in this work, especially since it was primarily linguistic in inspiration and was begun in order to provide the necessary background of 'history' for Elvish tongues.\n" +
                " \n" +
                "   When those whose advice and opinion I sought correctedlittle hope tono hope, I went back to the sequel, encouraged by requests from readers for more information concerning hobbits and their adventures. But the story was drawn irresistibly towards the older world, and became an account, as it were, of its end and passing away before its beginning and middle had been told. The process had begun in the writing ofThe Hobbit, in which there were already some references to the older matter: Elrond, Gondolin, the High-elves, and the orcs, as well as glimpses that had arisen unbidden of things higher or deeper or darker than its surface: Durin, Moria, Gandalf, the Necromancer, the Ring. The discovery of the significance of these glimpses and of their relation to the ancient histories revealed the Third Age and its culmination in the War of the Ring.";

        String[] words = text.split("[^a-zA-Z]+");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
