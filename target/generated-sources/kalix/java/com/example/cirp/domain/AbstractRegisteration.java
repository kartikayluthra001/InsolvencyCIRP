package com.example.cirp.domain;

import com.example.cirp.Components;
import com.example.cirp.ComponentsImpl;
import com.example.cirp.RegistrationAPI;
import com.google.protobuf.Empty;
import kalix.javasdk.valueentity.ValueEntity;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

public abstract class AbstractRegisteration extends ValueEntity<RegisterationDomain.RegisterState> {

  protected final Components components() {
    return new ComponentsImpl(commandContext());
  }

  public abstract Effect<Empty> createUser(RegisterationDomain.RegisterState currentState, RegistrationAPI.UserDetails userDetails);

  public abstract Effect<RegistrationAPI.verifyotpResponse> verifyOtp(RegisterationDomain.RegisterState currentState, RegistrationAPI.otp otp);

  public abstract Effect<RegistrationAPI.UserDetails> getUser(RegisterationDomain.RegisterState currentState, RegistrationAPI.getUser getUser);

}
