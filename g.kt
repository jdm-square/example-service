  /**
   * GET /payment/{payment_id}
   * @tag Payment Processing
   * @summary Payment
   * @security clientKey
   * @description This API will return the current snapshot of the payment. This API supports both
   * client and customer authorization headers.
   * @pathParam {string} payment_id - a payment id
   * @response 200 - The payment object.
   * @responseContent {GetPaymentResponse} 200.application/json
   */