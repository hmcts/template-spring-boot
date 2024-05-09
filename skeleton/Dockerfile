# renovate: datasource=github-releases depName=microsoft/ApplicationInsights-Java
ARG APP_INSIGHTS_AGENT_VERSION=3.5.2
ARG PLATFORM=""
# Application image

FROM hmctspublic.azurecr.io/base/java${PLATFORM}:21-distroless

COPY lib/applicationinsights.json /opt/app/
COPY build/libs/${{ values.product }}-${{ values.component }}.jar /opt/app/

EXPOSE ${{ values.http_port }}
CMD [ "${{ values.product }}-${{ values.component }}.jar" ]
