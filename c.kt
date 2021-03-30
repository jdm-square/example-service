  /**
   * POST /payment/{payment_id}/capture
   * @tag Payment Processing
   * @summary Capture Payment
   * @security clientKey
   * @description This API will capture the payment and return the current snapshot of the payment.
   * This API supports both client and customer authorization headers.
   * @pathParam {string} payment_id - a payment id
   * @response 200 - The payment object.
   * @responseContent {CapturePaymentResponse} 200.application/json
   */
  //FIXME(jmatthews) define "supports both client and customer authorization headers"