package com.example.cirp;

import com.example.cirp.domain.Registeration;
import com.example.cirp.domain.RegisterationProvider;
import kalix.javasdk.Kalix;
import kalix.javasdk.valueentity.ValueEntityContext;

import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public final class KalixFactory {

  public static Kalix withComponents(
      Function<ValueEntityContext, Registeration> createRegisteration) {
    Kalix kalix = new Kalix();
    return kalix
      .register(RegisterationProvider.of(createRegisteration));
  }
}
