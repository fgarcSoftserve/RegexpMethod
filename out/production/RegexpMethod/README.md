# RegexpMethod

## Description
This application serves as a powerful tool for text validation using custom regular expressions. It allows you to define and apply regular expressions to ensure that text adheres to specific rules and restrictions:
1. This regular expression should validate the maximum string length (passed as parameter); it should return a match if the string length is within the acceptable range and a non-match if it is not.
2. This regular expression should also validate that the string contains at least one uppercase letter, one lowercase letter, one digit, and one special character from a predefined list: !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~. It should return a match if the criteria are met and a non-match if they are not.
3. This regular expression should validate that the string does not contain any whitespace characters (spaces, tabs, or newlines). This should return a non-match if any whitespace characters are found.
4. The regular expression should be optimized for execution speed and simplicity. The regular expression should still fulfill all the above criteria.
5. The regular expression should be tested in code on a variety of sample inputs and edge cases (10) to ensure the regex is functioning properly.
6. The regular expression should be implemented within the code in a way that it can be easily reused for various inputs.

## Regex
Here's a breakdown of the provided regex:

1. ^: This indicates the start of a string.
2. (?!.\"\\S+\"): This is a negative lookahead assertion. It checks that the string does not contain a specific pattern, but the pattern itself seems to be incomplete or incorrect. It seems like you're trying to match something within double quotes, but the pattern inside the quotes is not complete. 
3. "(?=.*[a-z])": This part uses positive lookahead assertions to check if the string contains at least one lowercase letter.
4. "(?=.*[A-Z])": This part uses positive lookahead assertions to check if the string contains at least one uppercase letter.
5. "(?=.*\\d)": This part uses positive lookahead assertions to check if the string contains at least one digit.
6. "(?=.*[\\{}!"#$%&'()*+,-./:;<=>?@^_|~\[\]])": This part uses positive lookahead assertions to check if the string contains at least one special character (escaped properly).
7. "[A-Za-z\\d\\{}!"#$%&'()*+,-./:;<=>?@^_|~\[\]]{1,"+maxLength+"}$": This part defines the character set that the string can contain and specifies a range of minimum and maximum length (represented by maxLength). The variable maxLength` should be defined before using this regex pattern.