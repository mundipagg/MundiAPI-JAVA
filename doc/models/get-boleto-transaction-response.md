
# Get Boleto Transaction Response

Response object for getting a boleto transaction

## Structure

`GetBoletoTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Barcode` | `String` | Required | - | String getBarcode() | setBarcode(String barcode) |
| `NossoNumero` | `String` | Required | - | String getNossoNumero() | setNossoNumero(String nossoNumero) |
| `Bank` | `String` | Required | - | String getBank() | setBank(String bank) |
| `DocumentNumber` | `String` | Required | - | String getDocumentNumber() | setDocumentNumber(String documentNumber) |
| `Instructions` | `String` | Required | - | String getInstructions() | setInstructions(String instructions) |
| `BillingAddress` | [`GetBillingAddressResponse`](../../doc/models/get-billing-address-response.md) | Required | - | GetBillingAddressResponse getBillingAddress() | setBillingAddress(GetBillingAddressResponse billingAddress) |
| `DueAt` | `LocalDateTime` | Optional | - | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `QrCode` | `String` | Required | - | String getQrCode() | setQrCode(String qrCode) |
| `Line` | `String` | Required | - | String getLine() | setLine(String line) |
| `PdfPassword` | `String` | Required | - | String getPdfPassword() | setPdfPassword(String pdfPassword) |
| `Pdf` | `String` | Required | - | String getPdf() | setPdf(String pdf) |
| `PaidAt` | `LocalDateTime` | Optional | - | LocalDateTime getPaidAt() | setPaidAt(LocalDateTime paidAt) |
| `PaidAmount` | `String` | Required | - | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `CreditAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreditAt() | setCreditAt(LocalDateTime creditAt) |

## Example (as JSON)

```json
{
  "gateway_id": "gateway_id4",
  "amount": 250,
  "status": "status2",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "attempt_count": 30,
  "max_attempts": 214,
  "splits": [
    {
      "type": "type0",
      "amount": 114,
      "recipient": null,
      "gateway_id": "gateway_id0",
      "options": null,
      "id": "id0"
    },
    {
      "type": "type1",
      "amount": 115,
      "recipient": null,
      "gateway_id": "gateway_id1",
      "options": null,
      "id": "id9"
    }
  ],
  "next_attempt": null,
  "transaction_type": "boleto",
  "id": "id6",
  "gateway_response": {
    "code": "code0",
    "errors": [
      {
        "message": "message7"
      },
      {
        "message": "message8"
      },
      {
        "message": "message9"
      }
    ]
  },
  "antifraud_response": {
    "status": "status6",
    "return_code": "return_code4",
    "return_message": "return_message8",
    "provider_name": "provider_name8",
    "score": "score4"
  },
  "metadata": null,
  "split": [
    {
      "type": "type6",
      "amount": 196,
      "recipient": null,
      "gateway_id": "gateway_id6",
      "options": null,
      "id": "id4"
    },
    {
      "type": "type5",
      "amount": 197,
      "recipient": null,
      "gateway_id": "gateway_id5",
      "options": null,
      "id": "id5"
    }
  ],
  "interest": null,
  "fine": null,
  "max_days_to_pay_past_due": null,
  "url": "url4",
  "barcode": "barcode0",
  "nosso_numero": "nosso_numero0",
  "bank": "bank8",
  "document_number": "document_number6",
  "instructions": "instructions2",
  "billing_address": {
    "street": "street8",
    "number": "number4",
    "zip_code": "zip_code2",
    "neighborhood": "neighborhood4",
    "city": "city2",
    "state": "state6",
    "country": "country2",
    "complement": "complement6",
    "line_1": "line_18",
    "line_2": "line_26"
  },
  "due_at": null,
  "qr_code": "qr_code6",
  "line": "line2",
  "pdf_password": "pdf_password8",
  "pdf": "pdf0",
  "paid_at": null,
  "paid_amount": "paid_amount8",
  "type": "type0",
  "credit_at": null
}
```

