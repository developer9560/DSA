#include <stdio.h>
#include <stdlib.h>

#define MAX 100  // Maximum size of Stack

typedef struct Stack {
    int items[MAX];
    int top;
} Stack;

// Function to create a stack and initialize its top to -1
void createStack(Stack *s) {
    s->top = -1;
}

// Function to check if the stack is full
int isFull(Stack *s) {
    return s->top == MAX - 1;
}

// Function to check if the stack is empty
int isEmpty(Stack *s) {
    return s->top == -1;
}

// Function to add an element to the stack (push operation)
void push(Stack *s, int value) {
    if (isFull(s)) {
        printf("Stack Overflow! Cannot push %d\n", value);
    } else {
        s->items[++(s->top)] = value;
        printf("%d pushed to stack\n", value);
    }
}

// Function to remove an element from the stack (pop operation)
int pop(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack Underflow! Cannot pop\n");
        return -1;
    } else {
        return s->items[(s->top)--];
    }
}

// Function to peek the top element of the stack
int peek(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack is empty!\n");
        return -1;
    } else {
        return s->items[s->top];
    }
}

// Main function to demonstrate stack operations
int main() {
    Stack s;
    createStack(&s);

    push(&s, 10);
    push(&s, 20);
    push(&s, 30);

    printf("%d popped from stack\n", pop(&s));
    printf("Top element is %d\n", peek(&s));

    return 0;
}