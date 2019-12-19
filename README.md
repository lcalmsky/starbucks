안녕하세요. Payment개발팀 이정민입니다.

채널 포털에서 `redirect-uri`를 `sk-pay.co.kr`로 수정하고 진행했는데도 동일한 응답을 수신하고 있습니다.

요청하신 전체 URI 전달드립니다.

- api-dev
```
GET http://api-dev.skt-id.co.kr/auth/authorize.do?
state=c304ae2c-bb87-4c38-b0d2-e6c80b99c339&
client_id=75d8d58f-9124-4c86-91b8-fdeec26ea065&
client_secret=eyJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiQTI1NktXIn0.x856VygNDPnvHFzsdOm2vpN_P_V_jNbQjWu9-TuwNOTaqH2HITokUQ.-MC4qrkVnxyv46LK.UE_vwkhlAC6wPLSCBjE-NYESe5FpazvzWtUE2REYBed6tTZgM0twW-mptLn7Xcxb61TjqZzXzaxjOWEiniKAjEa2ZeCwe-Z7hxTL9sJ-ST-84AjPU2hf.wXojlJNFO280fJ1hxwD5Bg&
redirect_uri=https%3A%2F%2Fstg-pay.sk-pay.co.kr%2Fpages%2Flogin-result&
scope=openid&
response_type=id_token&
nonce=8f049b6c-e2d7-41ed-9217-b36f95c6856c&
service_type=14&
client_type=MWEB
```

- api-stg
```
GET http://api-stg.skt-id.co.kr/auth/authorize.do?
state=c304ae2c-bb87-4c38-b0d2-e6c80b99c339&
client_id=75d8d58f-9124-4c86-91b8-fdeec26ea065&
client_secret=eyJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiQTI1NktXIn0.x856VygNDPnvHFzsdOm2vpN_P_V_jNbQjWu9-TuwNOTaqH2HITokUQ.-MC4qrkVnxyv46LK.UE_vwkhlAC6wPLSCBjE-NYESe5FpazvzWtUE2REYBed6tTZgM0twW-mptLn7Xcxb61TjqZzXzaxjOWEiniKAjEa2ZeCwe-Z7hxTL9sJ-ST-84AjPU2hf.wXojlJNFO280fJ1hxwD5Bg&
redirect_uri=https%3A%2F%2Fstg-pay.sk-pay.co.kr%2Fpages%2Flogin-result&
scope=openid&
response_type=id_token&
nonce=8f049b6c-e2d7-41ed-9217-b36f95c6856c&
service_type=14&
client_type=MWEB
```

확인 부탁드립니다.

감사합니다.
