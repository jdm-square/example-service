  /**
   * POST /merchant
   * @tag Merchant Management
   * @summary Merchant
   * @security clientKey
   * @description Creates a new Merchant. Merchants do not have access to Cash App but are
   * instead used to represent a brand and depository account when processing payments from Cash
   * App users. A Cash App-held depository account (in the currency and country) is automatically
   * created for the Merchant. Processed payments are stored in this account until they are ready
   * for settlement.
   * @bodyContent {MerchantRequest} application/json
   * @bodyRequired
   * @response 200 - The newly created merchant object.
   * @responseContent {MerchantResponse} 200.application/json
   */