FROM golang:alpine3.15 AS buildando

WORKDIR  /app


COPY /src/app /app

RUN go mod init goapp && go build -o goapp


FROM scratch

WORKDIR /app

COPY --from=buildando /app/goapp /app

ENTRYPOINT ["/app/goapp"]
