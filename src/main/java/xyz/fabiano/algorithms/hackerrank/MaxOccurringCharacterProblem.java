package xyz.fabiano.algorithms.hackerrank;

class MaxOccurringCharacterProblem {
    public static char maximumOccurringCharacter(String text) {
        int[] counter = new int[256];

        for (char c : text.toCharArray()) {
            counter[c]++;
        }

        int mostFrequent = 0;
        char current = ' ';


        for (char c : text.toCharArray()) {
            if (mostFrequent < counter[c]) {
                mostFrequent = counter[c];
                current = c;
            }
        }

        return current;
    }
}