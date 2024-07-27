#!/bin/bash

# MinIO URL'sini ortam değişkeninden alın
MINIO_URL=$minio_url

grep "Tests run:" test_results.txt | head -1 > filtered_test_results.txt

TEST_RESULTS=$(awk '{printf "%s<br>", $0}' filtered_test_results.txt)

#TEST_RESULTS=$(awk '{printf "%s<br>", $0}' test_results.txt)

JSON_CONTENT=$(cat <<EOF
{
  "checkRestriction": true,
  "toEmail": "meric.bacak@gmail.com",
  "content": "<p>HerokuApp API Automation Results check this url :</p><p>$TEST_RESULTS</p><p>MinIO URL: <a href=\"$MINIO_URL\">$MINIO_URL</a></p><p>Saygılarımızla,</p>",
  "subject": "API Test Automation Results",
  "fromEmail": "info@communication.companyname.com",
  "polid": "null",
  "application": "emailserviceApp",
  "campaign": "TestProcess",
  "attachmentList": []
}
EOF
)

# JSON içeriğini API'ye gönder
curl -X POST -H "Content-Type: application/json" --data "$JSON_CONTENT" https://service-test.companyname.com.tr/emailservice/send

