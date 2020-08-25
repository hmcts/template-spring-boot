ARG APP_INSIGHTS_AGENT_VERSION=2.5.1

# Application image

FROM hmctspublic.azurecr.io/base/java:openjdk-11-distroless-1.4

COPY lib/AI-Agent.xml /opt/app/
COPY build/libs/{{ cookiecutter.product }}-{{ cookiecutter.component_id }} /opt/app/

EXPOSE {{ cookiecutter.http_port }}
CMD [ "{{ cookiecutter.product }}-{{ cookiecutter.component_id }}.jar" ]
