module.exports = {
  entry: {
    app: "./src/index.ts",
    polyfill: "./src/polyfill.ts",
    vendor: "./src/vendor.ts"
  },
  output: {
    filename: "./dest/[name].js"
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
  },
  devServer: {
    contentBase: "./dest/",
    compress: true,
    port: 10000
  }
};
