[
  {
    "ProfileName": "Test_XSS_append_DoubleEncoded",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,\u003cu\u003etest1337",
      "true,;\u003cu\u003etest1337",
      "true,%0d%0a\u003cu\u003etest1337",
      "true,%00\u003cu\u003etest1337"
    ],
    "Encoder": [
      "URL-encode all characters",
      "HTML-encode all characters"
    ],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,\u003cu\u003etest1337"
    ],
    "Tags": [
      "All",
      "XSS",
      "Test XSS"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": true,
    "OnlyHTTP": false,
    "IsContentType": true,
    "ContentType": "text/html",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 2,
    "MaxRedir": 4,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Test_XSS_append_DoubleEncoded",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Firm",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      1,
      64,
      0
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]