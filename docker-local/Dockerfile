#
# RELEASE stage
#
FROM 289208114389.dkr.ecr.us-east-1.amazonaws.com/picpay/graalvm-oraclelinux-slim:21.3-java17 AS release
COPY --chown=1001 /target/*.jar /app.jar
# docker-entrypoint.sh loads the env vars into the app.
# This is considered a safer approach over docker envs
# cause only the app has access to them, not the whole
# container
COPY docker-entrypoint.sh /
RUN chmod +x /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]
