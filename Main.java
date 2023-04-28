/**
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a-z).
 */
public class Main {

  /**
   * The approach will use a counter. It will start from 1 for each different character than the one before, and increment until it's repeating.
   * When the repeating sequence end - we'll store the current value of <b>counter</b> and reset it back to 1.
   *
   * Few things must be taken into account for the approach:
   *
   * <ol>
   *   <li>Simply return the input if it's null/blank or contains 1 character only</li>
   *   <li>When all elements are traversed, we need to account for the stored value in <b>counter</b> one last time</li>
   * </ol>
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static String compressV1(String input) {
    if (input == null || input.isBlank() || input.length() == 1) {
      return input;
    }

    int inputLength = input.length();
    int counter = 1;
    StringBuilder compressedSb = new StringBuilder(inputLength);

    for (int i = 1; i < inputLength; i++) {
      char prev = input.charAt(i - 1);

      if (input.charAt(i) != prev) {
        compressedSb.append(prev).append(counter);

        counter = 1;
      } else {
        counter++;
      }
    }

    compressedSb.append(input.charAt(inputLength - 1)).append(counter);

    String compressed = compressedSb.toString();

    if (compressed.length() >= inputLength) {
      return input;
    }

    return compressed;
  }
}
