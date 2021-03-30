  /**
   * PUT /merchant
   * @tag Merchant Management
   * @summary Merchant
   * @security clientKey
   * @description Similar to the Create Merchant API, however this API can either updates or
   * creates a merchant (upsert).
   * @bodyContent {MerchantRequest} application/json
   * @bodyRequired
   * @response 200 - The newly created merchant object.
   * @responseContent {MerchantResponse} 200.application/json
   */