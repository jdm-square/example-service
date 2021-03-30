 ) : ClientAction {
   val logger = getLogger<GetCustomerAction>()

  /**
   * GET /customer
   * @tag Customer OAuth
   * @summary Customer
   * @security accessToken
   * @description Returns a profile snapshot of a customer based on the access-token used to
   * authenticate the call
   * @response 200 - The customer object.
   * @responseContent {CustomerResponse} 200.application/json
   */
   @Get("/customer")
   @RequestContentType(MediaTypes.APPLICATION_JSON)
   @ResponseContentType(MediaTypes.APPLICATION_JSON)