package com.example.cirp;

import com.example.cirp.domain.RegisterationDomain;
import com.google.protobuf.Empty;
import kalix.javasdk.testkit.junit.KalixTestKitResource;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

// Example of an integration test calling our service via the Kalix proxy
// Run all test classes ending with "IntegrationTest" using `mvn verify -Pit`
public class RegisterationIntegrationTest {

  /**
   * The test kit starts both the service container and the Kalix proxy.
   */
  @ClassRule
  public static final KalixTestKitResource testKit =
    new KalixTestKitResource(Main.createKalix());

  /**
   * Use the generated gRPC client to call the service through the Kalix proxy.
   */
  private final RegistrationService client;

  public RegisterationIntegrationTest() {
    client = testKit.getGrpcClient(RegistrationService.class);
  }

  @Test
  @Ignore("to be implemented")
  public void createUserOnNonExistingEntity() throws Exception {
    // TODO: set fields in command, and provide assertions to match replies
    // client.createUser(RegistrationAPI.UserDetails.newBuilder().build())
    //         .toCompletableFuture().get(5, SECONDS);
  }

  @Test
  @Ignore("to be implemented")
  public void verifyOtpOnNonExistingEntity() throws Exception {
    // TODO: set fields in command, and provide assertions to match replies
    // client.verifyOtp(RegistrationAPI.otp.newBuilder().build())
    //         .toCompletableFuture().get(5, SECONDS);
  }

  @Test
  @Ignore("to be implemented")
  public void getUserOnNonExistingEntity() throws Exception {
    // TODO: set fields in command, and provide assertions to match replies
    // client.getUser(RegistrationAPI.getUser.newBuilder().build())
    //         .toCompletableFuture().get(5, SECONDS);
  }
}
