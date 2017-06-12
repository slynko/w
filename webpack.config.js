module.exports = {
  entry: {
    app: "./src/main/resources/static/index.ts",
    polyfill: "./src/main/resources/static/polyfill.ts",
    vendor: "./src/main/resources/static/vendor.ts"
  },
  output: {
    filename: "./src/main/webapp/[name].js"
  },
  module: {
    loaders: [
      {
        test: /\.ts$/,
        loader: "babel-loader",
        exclude: /node_modules/,
        query: {
          plugins: ['transform-decorators-legacy']
        }
      }
    ]
  },
  resolve: {
    extensions: [".js", ".ts"]
  }
};
