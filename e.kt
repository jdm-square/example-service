  /**
   * POST /payment
   * @tag Payment Processing
   * @summary Payment
   * @security accessToken
   * @description This API will authorize a payment on an authorized customer. If the API result is
   * HTTP 200, then that means the payment was successfully authorized. If HTTP 4XX then the payment
   * was not created, the response will include an error code. If the result is indeterminate, it is
   * important to repeat the request using the same request_id until the outcome is known.
   *
   * The customer (buyer) authorizing the payment is implied through the access-token proved to
   * authorize this API. The counterparty represents a merchant, and where the funds will pool
   * prior to settlement.
   * @bodyContent {CreatePaymentRequest} application/json
   * @response 200 - The payment object.
   * @response 400 - The payment was not created.
   * @responseContent {CreatePaymentResponse} 200.application/json
   */
  //FIXME(jmatthews) - what constitutes 4XX? what does "the response will include an error code" mean?
  //FIXME(jmatthews) - mark merchant.id as required

   @Post("/payment")
   @Idempotent(key = "request_id")
   @RequestContentType(MediaTypes.APPLICATION_JSON)