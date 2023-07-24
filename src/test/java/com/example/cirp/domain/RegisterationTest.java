package com.example.cirp.domain;

import com.example.cirp.RegistrationAPI;
import com.google.protobuf.Empty;
import kalix.javasdk.testkit.ValueEntityResult;
import kalix.javasdk.valueentity.ValueEntity;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class RegisterationTest {

  @Test
  @Ignore("to be implemented")
  public void exampleTest() {
    RegisterationTestKit service = RegisterationTestKit.of(Registeration::new);
    // // use the testkit to execute a command
    // // of events emitted, or a final updated state:
    // SomeCommand command = SomeCommand.newBuilder()...build();
    // ValueEntityResult<SomeResponse> result = service.someOperation(command);
    // // verify the reply
    // SomeReply reply = result.getReply();
    // assertEquals(expectedReply, reply);
    // // verify the final state after the command
    // assertEquals(expectedState, service.getState());
  }

  @Test
  @Ignore("to be implemented")
  public void createUserTest() {
    RegisterationTestKit service = RegisterationTestKit.of(Registeration::new);
    // UserDetails command = UserDetails.newBuilder()...build();
    // ValueEntityResult<Empty> result = service.createUser(command);
  }


  @Test
  @Ignore("to be implemented")
  public void verifyOtpTest() {
    RegisterationTestKit service = RegisterationTestKit.of(Registeration::new);
    // otp command = otp.newBuilder()...build();
    // ValueEntityResult<verifyotpResponse> result = service.verifyOtp(command);
  }


  @Test
  @Ignore("to be implemented")
  public void getUserTest() {
    RegisterationTestKit service = RegisterationTestKit.of(Registeration::new);
    // getUser command = getUser.newBuilder()...build();
    // ValueEntityResult<UserDetails> result = service.getUser(command);
  }

}
