[{"Name":"FireBase_API","Active":true,"Scanner":2,"Author":"@syed__umar","Payloads":[],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":["apiKey:\\s\"(.*?)\","],"Tags":["All","InformationDisclosure"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":true,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"MatchType":2,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"Firebase API Token leakage","IssueSeverity":"Medium","IssueConfidence":"Firm","IssueDetail":"The API key of Firebase was found present in the source code of the web application. As it is, it doesn\u0027t pose any threat to the application. \n\nBut, do try this POC: https://gist.github.com/Anon-Exploiter/5232869d84d01d0e90377410ef25f576\n\nHost the above .html file on a server/vps (don\u0027t try on localhost, sometimes DEVs allow localhost for their own servers) - If it works, that means there\u0027s no restriction and anyone can utilize the keys to query the database from any application.","RemediationDetail":"","IssueBackground":"","RemediationBackground":"Restrict the firebase keys to the Web Application\u0027s URL/Host only\n\nReference: https://stackoverflow.com/questions/35418143/how-to-restrict-firebase-data-modifications","Header":[],"VariationAttributes":[],"InsertionPointType":[],"pathDiscovery":false}]
