package com.example.cirp.domain;

import com.example.cirp.RegistrationAPI;
import com.google.protobuf.Empty;
import kalix.javasdk.valueentity.ValueEntityContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Value Entity Service described in your com/example/cirp/register_api.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class Registeration extends AbstractRegisteration {
  @SuppressWarnings("unused")
  private final String entityId;

  public Registeration(ValueEntityContext context) {
    this.entityId = context.entityId();
  }

  @Override
  public RegisterationDomain.RegisterState emptyState() {
    throw new UnsupportedOperationException("Not implemented yet, replace with your empty entity state");
  }

  @Override
  public Effect<Empty> createUser(RegisterationDomain.RegisterState currentState, RegistrationAPI.UserDetails userDetails) {
    return effects().error("The command handler for `CreateUser` is not implemented, yet");
  }

  @Override
  public Effect<RegistrationAPI.verifyotpResponse> verifyOtp(RegisterationDomain.RegisterState currentState, RegistrationAPI.otp otp) {
    return effects().error("The command handler for `VerifyOtp` is not implemented, yet");
  }

  @Override
  public Effect<RegistrationAPI.UserDetails> getUser(RegisterationDomain.RegisterState currentState, RegistrationAPI.getUser getUser) {
    return effects().error("The command handler for `GetUser` is not implemented, yet");
  }
}
