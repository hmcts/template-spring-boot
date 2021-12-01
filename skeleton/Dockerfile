ARG APP_INSIGHTS_AGENT_VERSION=2.6.3

# Application image

FROM hmctspublic.azurecr.io/base/java:openjdk-11-distroless-1.4

COPY lib/AI-Agent.xml /opt/app/
COPY build/libs/${{ values.product }}-${{ values.component }}.jar /opt/app/

EXPOSE ${{ values.http_port }}
CMD [ "${{ values.product }}-${{ values.component }}.jar" ]
