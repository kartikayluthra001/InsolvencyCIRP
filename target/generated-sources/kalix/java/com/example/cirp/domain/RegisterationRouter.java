package com.example.cirp.domain;

import com.example.cirp.RegistrationAPI;
import com.google.protobuf.Empty;
import kalix.javasdk.impl.valueentity.ValueEntityRouter;
import kalix.javasdk.valueentity.CommandContext;
import kalix.javasdk.valueentity.ValueEntity;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * A value entity handler that is the glue between the Protobuf service <code>RegistrationService</code>
 * and the command handler methods in the <code>Registeration</code> class.
 */
public class RegisterationRouter extends ValueEntityRouter<RegisterationDomain.RegisterState, Registeration> {

  public RegisterationRouter(Registeration entity) {
    super(entity);
  }

  @Override
  public ValueEntity.Effect<?> handleCommand(
      String commandName, RegisterationDomain.RegisterState state, Object command, CommandContext context) {
    switch (commandName) {

      case "CreateUser":
        return entity().createUser(state, (RegistrationAPI.UserDetails) command);

      case "VerifyOtp":
        return entity().verifyOtp(state, (RegistrationAPI.otp) command);

      case "GetUser":
        return entity().getUser(state, (RegistrationAPI.getUser) command);

      default:
        throw new ValueEntityRouter.CommandHandlerNotFound(commandName);
    }
  }
}
