package com.example.demo.rest.auth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class JWTResponseApiDto {
    // Mensaje relacionado con la respuesta (puede ser un mensaje descriptivo)
  String message;
  // Token JWT devuelto como parte de la respuesta
  String token;
}
