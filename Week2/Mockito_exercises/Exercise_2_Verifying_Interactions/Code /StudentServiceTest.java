package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class StudentServiceTest {

    @Test
    public void testRegister_VerifiesSaveCalled() {
        // Arrange
        StudentRepository mockRepo = Mockito.mock(StudentRepository.class);
        StudentService service = new StudentService(mockRepo);

        // Act
        service.register("Abhishek");

        // Assert - verify interaction
        verify(mockRepo).saveStudent("Abhishek"); // ✅ method was called with correct argument
        verify(mockRepo, times(1)).saveStudent("Abhishek"); // ✅ called exactly once
    }

    @Test
    public void testRegister_DoesNotCallSaveIfNameIsEmpty() {
        StudentRepository mockRepo = Mockito.mock(StudentRepository.class);
        StudentService service = new StudentService(mockRepo);

        service.register("");

        verify(mockRepo, never()).saveStudent(anyString()); // ✅ was never called
    }
}
