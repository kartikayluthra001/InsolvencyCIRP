package com.example.cirp.domain;

import com.example.cirp.RegistrationAPI;
import com.google.protobuf.Empty;
import kalix.javasdk.Metadata;
import kalix.javasdk.impl.effect.MessageReplyImpl;
import kalix.javasdk.impl.effect.SecondaryEffectImpl;
import kalix.javasdk.impl.valueentity.ValueEntityEffectImpl;
import kalix.javasdk.testkit.ValueEntityResult;
import kalix.javasdk.testkit.impl.TestKitValueEntityCommandContext;
import kalix.javasdk.testkit.impl.TestKitValueEntityContext;
import kalix.javasdk.testkit.impl.ValueEntityResultImpl;
import kalix.javasdk.valueentity.ValueEntity;
import kalix.javasdk.valueentity.ValueEntityContext;

import java.util.Optional;
import java.util.function.Function;

// This code is managed by Kalix tooling.
// It will be re-generated to reflect any changes to your protobuf definitions.
// DO NOT EDIT

/**
 * TestKit for unit testing Registeration
 */
public final class RegisterationTestKit {

  private RegisterationDomain.RegisterState state;
  private final RegisterationDomain.RegisterState emptyState;
  private final Registeration entity;
  private final String entityId;

  /**
   * Create a testkit instance of Registeration
   * @param entityFactory A function that creates a Registeration based on the given ValueEntityContext,
   *                      a default entity id is used.
   */
  public static RegisterationTestKit of(Function<ValueEntityContext, Registeration> entityFactory) {
    return of("testkit-entity-id", entityFactory);
  }

  /**
   * Create a testkit instance of Registeration with a specific entity id.
   */
  public static RegisterationTestKit of(String entityId, Function<ValueEntityContext, Registeration> entityFactory) {
    return new RegisterationTestKit(entityFactory.apply(new TestKitValueEntityContext(entityId)), entityId);
  }

  /** Construction is done through the static RegisterationTestKit.of-methods */
  private RegisterationTestKit(Registeration entity, String entityId) {
    this.entityId = entityId;
    this.state = entity.emptyState();
    this.emptyState = state;
    this.entity = entity;
  }

  private RegisterationTestKit(Registeration entity, String entityId, RegisterationDomain.RegisterState state) {
    this.entityId = entityId;
    this.state = state;
    this.emptyState = state;
    this.entity = entity;
  }

  /**
   * @return The current state of the Registeration under test
   */
  public RegisterationDomain.RegisterState getState() {
    return state;
  }

  private <Reply> ValueEntityResult<Reply> interpretEffects(ValueEntity.Effect<Reply> effect) {
    @SuppressWarnings("unchecked")
    ValueEntityResultImpl<Reply> result = new ValueEntityResultImpl<>(effect);
    if (result.stateWasUpdated()) {
      this.state = (RegisterationDomain.RegisterState) result.getUpdatedState();
    } else if (result.stateWasDeleted()) {
      this.state = emptyState;
    }
    return result;
  }

  public ValueEntityResult<Empty> createUser(RegistrationAPI.UserDetails userDetails, Metadata metadata) {
    entity._internalSetCommandContext(Optional.of(new TestKitValueEntityCommandContext(entityId, metadata)));
    entity._internalSetCurrentState(state);
    ValueEntity.Effect<Empty> effect = entity.createUser(state, userDetails);
    return interpretEffects(effect);
  }

  public ValueEntityResult<RegistrationAPI.verifyotpResponse> verifyOtp(RegistrationAPI.otp otp, Metadata metadata) {
    entity._internalSetCommandContext(Optional.of(new TestKitValueEntityCommandContext(entityId, metadata)));
    entity._internalSetCurrentState(state);
    ValueEntity.Effect<RegistrationAPI.verifyotpResponse> effect = entity.verifyOtp(state, otp);
    return interpretEffects(effect);
  }

  public ValueEntityResult<RegistrationAPI.UserDetails> getUser(RegistrationAPI.getUser getUser, Metadata metadata) {
    entity._internalSetCommandContext(Optional.of(new TestKitValueEntityCommandContext(entityId, metadata)));
    entity._internalSetCurrentState(state);
    ValueEntity.Effect<RegistrationAPI.UserDetails> effect = entity.getUser(state, getUser);
    return interpretEffects(effect);
  }

  public ValueEntityResult<Empty> createUser(RegistrationAPI.UserDetails userDetails) {
    entity ._internalSetCommandContext(Optional.of(new TestKitValueEntityCommandContext(entityId, Metadata.EMPTY)));
    ValueEntity.Effect<Empty> effect = entity.createUser(state, userDetails);
    return interpretEffects(effect);
  }

  public ValueEntityResult<RegistrationAPI.verifyotpResponse> verifyOtp(RegistrationAPI.otp otp) {
    entity ._internalSetCommandContext(Optional.of(new TestKitValueEntityCommandContext(entityId, Metadata.EMPTY)));
    ValueEntity.Effect<RegistrationAPI.verifyotpResponse> effect = entity.verifyOtp(state, otp);
    return interpretEffects(effect);
  }

  public ValueEntityResult<RegistrationAPI.UserDetails> getUser(RegistrationAPI.getUser getUser) {
    entity ._internalSetCommandContext(Optional.of(new TestKitValueEntityCommandContext(entityId, Metadata.EMPTY)));
    ValueEntity.Effect<RegistrationAPI.UserDetails> effect = entity.getUser(state, getUser);
    return interpretEffects(effect);
  }
}
