  /**
   * POST /payment/{payment_id}/refund
   * @tag Payment Processing
   * @summary Refund
   * @security clientKey
   * @description This API will void or refund the payment and return the current snapshot of the
   * payment. This API variant requires client authorization.
   *
   * NOTE: Currently only full refunds are supported.
   * @bodyContent {RefundPaymentRequest} application/json
   * @response 200 - The payment object.
   * @responseContent {RefundPaymentResponse} 200.application/json
   */