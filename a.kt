  /**
   * POST /access-token
   * @tag Client
   * @summary Access Token
   * @security clientKey
   * @description This API generates access tokens to operate on a Cash App user and applies
   * to the following scenarios:
   *
   * 1. Takes an Authorization Code obtained through the completion of the authorization flow
   * for a Cash App user. An Access Token (Short Lifetime) + Refresh Token (Permanent until
   * revoked) are provided to the Client App. The access token can be used immediately to perform
   * actions on the Cash App user. The refresh token should be securely saved (on the Client Server)
   * for future user actions.
   *
   * 2. Takes a Refresh Token obtained through the previous authorization flow for the Cash App
   * user to generate a new short-lived Access Token. This access token can have limited permissions
   * by requesting a subset of scopes from the original authorization flow. Requesting scopes that
   * weren't granted on the original authorization flow will result in an unauthorized error.
   * @bodyContent {AccessTokenRequest} application/json
   * @bodyRequired
   * @response 200 - A JSON array of user names
   * @responseContent {AccessTokenResponse} 200.application/json
   */
  // FIXME(jmatthews) define "unauthorized error"