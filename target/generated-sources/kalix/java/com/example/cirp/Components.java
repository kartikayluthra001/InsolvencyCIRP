package com.example.cirp;

import kalix.javasdk.DeferredCall;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * Not intended for user extension, provided through generated implementation
 */
public interface Components {
  RegisterationCalls registeration();

  interface RegisterationCalls {
    DeferredCall<com.example.cirp.RegistrationAPI.UserDetails, com.google.protobuf.Empty> createUser(com.example.cirp.RegistrationAPI.UserDetails userDetails);

    DeferredCall<com.example.cirp.RegistrationAPI.otp, com.example.cirp.RegistrationAPI.verifyotpResponse> verifyOtp(com.example.cirp.RegistrationAPI.otp otp);

    DeferredCall<com.example.cirp.RegistrationAPI.getUser, com.example.cirp.RegistrationAPI.UserDetails> getUser(com.example.cirp.RegistrationAPI.getUser getUser);
  }
}
