/* NAME: stringLength */
#include <stdio.h>

char string[5] = {'t', 'e', 's', 't', '\0'};

void main() {
	for (int j = 0; j < 5; j = j + 1) {
		printf("%d ", string[j]);
	}
	printf("\n");
}

int strLength(char str[]) {}
