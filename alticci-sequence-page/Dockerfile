FROM node:latest as node-angular
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod

FROM nginx:alpine
COPY --from=node-angular /app/dist/alticce-sequence-page /usr/share/nginx/html