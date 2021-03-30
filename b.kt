   @Inject @LiaisonDb lateinit var transacter: Transacter
   @Inject lateinit var urlFactory: UrlFactory

  /**
   * POST /authorization
   * @tag Client
   * @summary Authorization
   * @security clientKey
   * @description Starts an authorization flow for an existing Cash App customer to grant
   * account permissions. The customer enters the flow by visiting the redirect_url in the
   * response or scanning the QR image provided by qr_url.
   *
   * If the customer approves the request for the scopes specified, they will be directed to
   * redirect_uri with an Authorization Code and State in the query parameters to continue the
   * flow. The integration retrieves the Authorization Code from the redirect and uses it with
   * the Access Token endpoint below.
   *
   * Once the customer has accepted or declined the authorization request, they will be
   * [redirected](doc:mobile-redirects) back to the client-specified redirect_uri. A
   * [webhook event](doc:webhooks) is also generated if the client server is configured to
   * receive them.
   * @bodyContent {AuthorizationRequest} application/json
   * @bodyRequired
   * @response 200 - Assorted values needed for continuing the authorization process.
   * @responseContent {AuthorizationResponse} 200.application/json
   */
   /**
    * Called by a platform client to generate a URL to start a Cash customer approval flow.
    * Creates an enrollment token bound to the request parameters in Cash-Oauth and uses the