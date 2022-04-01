ARG APP_INSIGHTS_AGENT_VERSION=3.2.10

# Application image

FROM hmctspublic.azurecr.io/base/java:openjdk-17-distroless

COPY lib/AI-Agent.xml /opt/app/
COPY build/libs/${{ values.product }}-${{ values.component }}.jar /opt/app/

EXPOSE ${{ values.http_port }}
CMD [ "${{ values.product }}-${{ values.component }}.jar" ]
