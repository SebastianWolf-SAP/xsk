package com.sap.xsk.migration.api.dto;

import org.junit.Test;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NeoDataTest {

  @Test
  public void testValidationAnnotationsAreSet() throws NoSuchMethodException {
    var declaredMethods = NeoData.class.getDeclaredMethods();

    var allMethodsAreAnnotated = Arrays.stream(declaredMethods).allMatch(m -> m.getAnnotation(NotBlank.class) != null);
    var getUserMethodEmailAnnotation = NeoData.class.getDeclaredMethod("getUsername").getAnnotation(Email.class);

    assertTrue("Some method(s) are not annotated with @NotBlank", allMethodsAreAnnotated);
    assertNotNull("Method getUsername is not annotated with @Email", getUserMethodEmailAnnotation);
  }
}