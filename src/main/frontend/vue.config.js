const webpack = require('webpack')

module.exports = {
  configureWebpack: {
    plugins: [
      new webpack.LoaderOptionsPlugin({
        options: {
          resolve: {
            alias: {
              'vue$': 'vue/dist/vue.esm.js'
            }
          }
        }
      })
    ]
  }
}