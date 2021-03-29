package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
  @Test
  public void shouldHaveAllFieldsAndMethodFromSuperClass() {
    Book book = new Book();
  }

  @Test
  public void shouldEquals() {
    Book book1 = new Book(1, "JAVA", 1000, "T");
    Book book2 = new Book(1, "JAVA", 1000, "T");

    assertEquals(book1, book2);
  }
}
