package com.mutation.demoService.service;

import com.mutation.demoService.exception.InvalidNumberException;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

  public int addition(int x, int y) throws InvalidNumberException {
    if (x < 0) {
      throw new InvalidNumberException("x is negative value");
    }

    if (y < 0) {
      throw new InvalidNumberException("y is negative value");
    }

    return x + y;
  }
}
