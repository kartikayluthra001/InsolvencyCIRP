package com.example.cirp;

import kalix.javasdk.Context;
import kalix.javasdk.DeferredCall;
import kalix.javasdk.impl.GrpcDeferredCall;
import kalix.javasdk.impl.InternalContext;
import kalix.javasdk.impl.MetadataImpl;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * Not intended for direct instantiation, called by generated code, use Action.components() to access
 */
public final class ComponentsImpl implements Components {

  private final InternalContext context;

  public ComponentsImpl(Context context) {
    this.context = (InternalContext) context;
  }

  private <T> T getGrpcClient(Class<T> serviceClass) {
    return context.getComponentGrpcClient(serviceClass);
  }

  @Override
  public Components.RegisterationCalls registeration() {
    return new RegisterationCallsImpl();
  }

  private final class RegisterationCallsImpl implements Components.RegisterationCalls {
     @Override
    public DeferredCall<com.example.cirp.RegistrationAPI.UserDetails, com.google.protobuf.Empty> createUser(com.example.cirp.RegistrationAPI.UserDetails userDetails) {
      return new GrpcDeferredCall<>(
        userDetails,
        MetadataImpl.Empty(),
        "com.example.cirp.RegistrationService",
        "CreateUser",
        () -> getGrpcClient(com.example.cirp.RegistrationService.class).createUser(userDetails)
      );
    }
    @Override
    public DeferredCall<com.example.cirp.RegistrationAPI.otp, com.example.cirp.RegistrationAPI.verifyotpResponse> verifyOtp(com.example.cirp.RegistrationAPI.otp otp) {
      return new GrpcDeferredCall<>(
        otp,
        MetadataImpl.Empty(),
        "com.example.cirp.RegistrationService",
        "VerifyOtp",
        () -> getGrpcClient(com.example.cirp.RegistrationService.class).verifyOtp(otp)
      );
    }
    @Override
    public DeferredCall<com.example.cirp.RegistrationAPI.getUser, com.example.cirp.RegistrationAPI.UserDetails> getUser(com.example.cirp.RegistrationAPI.getUser getUser) {
      return new GrpcDeferredCall<>(
        getUser,
        MetadataImpl.Empty(),
        "com.example.cirp.RegistrationService",
        "GetUser",
        () -> getGrpcClient(com.example.cirp.RegistrationService.class).getUser(getUser)
      );
    }
  }
}
