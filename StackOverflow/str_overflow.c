#include <stdio.h>

int my_strlen(char *string) {
  int counter = 0;
  char current_char;
  do {
    current_char = string[counter];
    counter++;
  } while (current_char != '\0');
  return counter;
}

void my_strcpy(char *source, char *destination) {
  int counter = 0;
  char current_char;
  do {
    destination[counter] = source[counter];
    current_char = source[counter];
    counter++;
  } while (current_char != '\0');
}

int main() {
  printf("initalizing variables\n");
  char test[8] = {'H', 'e', 'l', 'l', 'o', '\0', '1', '2'};
  char test2[10] = {};
  char test3[4];
  printf("test[8] = {'H', 'e', 'l', 'l', 'o', '\\0', '1', '2'}\n %s \n", test);
  printf("test2[10] = {}\n %s \n", test2);
  printf("test3[4]\n %s \n", test3);
  printf("length of test is: %d\n", my_strlen(test));
  printf("length of test2 is: %d\n", my_strlen(test2));
  printf("length of test3 is: %d\n", my_strlen(test3));
  printf("copy test into test2\n");
  my_strcpy(test, test2);
  printf("test2 = %s\n", test2);
  printf("copy test into test3\n");
  my_strcpy(test, test3);
  printf("test3 = %s\n", test3);
  printf("length of test3 is: %d\n", my_strlen(test3));
  printf("printing all strings, test=%s, test2=%s, test3=%s\n", test, test2,
         test3);

  return 0;
}
