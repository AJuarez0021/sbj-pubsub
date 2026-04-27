# sbj-pubsub
```
docker run -d   -p 8085:8085   --name pubsub-emulator   gcr.io/google.com/cloudsdktool/cloud-sdk:latest   gcloud beta emulators pubsub start --host-port=0.0.0.0:8085
docker exec -it pubsub-emulator bash
gcloud auth login --no-launch-browser
export PUBSUB_EMULATOR_HOST=localhost:8085
gcloud config set project test-project
gcloud pubsub topics create test-topic
gcloud pubsub subscriptions create test-subscribe --topic=test-topic
```
```
gcloud init
gcloud config set accessibility/screen_reader true
gcloud auth application-default login
gcloud auth list
gcloud config list
```