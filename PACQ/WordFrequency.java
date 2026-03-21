/*
Problem Statement:
    Given a space-separated string of words, count the frequency of each distinct word. 
    Print each unique word followed by its frequency, preserving the order of the word’s first appearance in the input.
    The output should capitalize the first letter of each word.

Input:
    A single line containing space-separated words.

Output:
    A single line where each unique word (with its first letter capitalized) is followed by a space and its frequency,
    all separated by single spaces.

Constraints:
    1 ≤ total words ≤ 10^5
    Each word contains only lowercase letters a–z.

Explanation:
    For input: "apple banana apple banana apple orange banana"
    Order of first appearance: apple, banana, orange
    Frequencies: apple→3, banana→3, orange→1
    Output: "Apple 3 Banana 3 Orange 1"

Sample Input:
    apple banana apple banana apple orange banana
Sample Output:
    Apple 3 Banana 3 Orange 1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordFrequency {
    private static String capitalize(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        if (input == null || input.trim().isEmpty()) {
            return;
        }

        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (result.length() > 0) {
                result.append(' ');
            }
            result.append(capitalize(entry.getKey()))
                  .append(' ')
                  .append(entry.getValue());
        }

        System.out.print(result);
    }
}
