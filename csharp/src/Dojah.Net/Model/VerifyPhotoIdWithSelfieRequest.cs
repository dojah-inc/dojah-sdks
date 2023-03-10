/*
 * DOJAH APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// VerifyPhotoIdWithSelfieRequest
    /// </summary>
    [DataContract(Name = "VerifyPhotoIdWithSelfieRequest")]
    public partial class VerifyPhotoIdWithSelfieRequest : IEquatable<VerifyPhotoIdWithSelfieRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VerifyPhotoIdWithSelfieRequest" /> class.
        /// </summary>
        /// <param name="selfieImage">selfieImage.</param>
        /// <param name="photoidImage">photoidImage.</param>
        public VerifyPhotoIdWithSelfieRequest(string selfieImage = default(string), string photoidImage = default(string))
        {
            this.SelfieImage = selfieImage;
            this.PhotoidImage = photoidImage;
        }

        /// <summary>
        /// Gets or Sets SelfieImage
        /// </summary>
        [DataMember(Name = "selfie_image", EmitDefaultValue = false)]
        public string SelfieImage { get; set; }

        /// <summary>
        /// Gets or Sets PhotoidImage
        /// </summary>
        [DataMember(Name = "photoid_image", EmitDefaultValue = false)]
        public string PhotoidImage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VerifyPhotoIdWithSelfieRequest {\n");
            sb.Append("  SelfieImage: ").Append(SelfieImage).Append("\n");
            sb.Append("  PhotoidImage: ").Append(PhotoidImage).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as VerifyPhotoIdWithSelfieRequest);
        }

        /// <summary>
        /// Returns true if VerifyPhotoIdWithSelfieRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of VerifyPhotoIdWithSelfieRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VerifyPhotoIdWithSelfieRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SelfieImage == input.SelfieImage ||
                    (this.SelfieImage != null &&
                    this.SelfieImage.Equals(input.SelfieImage))
                ) && 
                (
                    this.PhotoidImage == input.PhotoidImage ||
                    (this.PhotoidImage != null &&
                    this.PhotoidImage.Equals(input.PhotoidImage))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.SelfieImage != null)
                {
                    hashCode = (hashCode * 59) + this.SelfieImage.GetHashCode();
                }
                if (this.PhotoidImage != null)
                {
                    hashCode = (hashCode * 59) + this.PhotoidImage.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}